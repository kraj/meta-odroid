# Odroid XU default BSP

include conf/machine/include/samsung-exynos.inc
include conf/machine/include/odroid-default-settings.inc

DEFAULTTUNE = "cortexa15thf-neon-vfpv4"
include conf/machine/include/tune-cortexa15.inc

UBOOT_FDT_LOADADDR = "0x40800000"
UBOOT_LOADADDR = "0x40007FC0"
UBOOT_LOADADDRESS = "0x40007FC0"
UBOOT_KERNEL_NAME = "zImage"

WKS_FILE ?= "odroid_xu-u-boot.wks"

MACHINE_FEATURES_append = " alsa screen"

VIRTUAL-RUNTIME_mesa = "mesa"
PREFERRED_PROVIDER_virtual/gpu = "mali-t62x"

PREFERRED_PROVIDER_virtual/egl = "${PREFERRED_PROVIDER_virtual/gpu}" 
PREFERRED_PROVIDER_virtual/libgbm = "${PREFERRED_PROVIDER_virtual/gpu}"
PREFERRED_PROVIDER_virtual/libgles1 = "${PREFERRED_PROVIDER_virtual/gpu}"
PREFERRED_PROVIDER_virtual/libgles2 = "${PREFERRED_PROVIDER_virtual/gpu}"
PREFERRED_PROVIDER_virtual/libopencl = "${PREFERRED_PROVIDER_virtual/gpu}"
PREFERRED_PROVIDER_virtual/libgl = "${VIRTUAL-RUNTIME_mesa}"
PREFERRED_PROVIDER_virtual/mesa = "${VIRTUAL-RUNTIME_mesa}"

XSERVER = " \
    xserver-xorg \
    xf86-video-fbdev \
    ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'xserver-xorg-extension-glx', '', d)} \
    xf86-input-evdev \
    xf86-input-mouse \
    xf86-input-keyboard \
    xf86-video-modesetting \
    xserver-xorg-module-libint10 \
"
