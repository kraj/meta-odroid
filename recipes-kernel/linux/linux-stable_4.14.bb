FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.14.49"
KBRANCH ?= "linux-4.14.y"
SRCREV ?= "70d7bbd9b504c1dde0dc44a469a513695d9cbdd6"

require linux-stable.inc


O_KERNEL_CONFIG_odroid-xu3  = "odroid-xu3"
O_KERNEL_CONFIG_odroid-xu4  = "odroid-xu4"
O_KERNEL_CONFIG_odroid-xu3-lite  = "odroid-xu3"
O_KERNEL_CONFIG_odroid-hc1  = "odroid-hc1"
O_KERNEL_CONFIG_odroid-c2  = "odroid-c2"
O_KERNEL_CONFIG_odroid-c1  = "odroid-c1"

SRC_URI += "file://${O_KERNEL_CONFIG}/defconfig"

SRC_URI += "file://meson64.scc \
            file://touchscreen.cfg \
"
