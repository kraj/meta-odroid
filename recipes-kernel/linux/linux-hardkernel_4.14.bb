FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.14.69"
KBRANCH ?= "odroidxu4-4.14.y"
SRCREV ?= "6cd091793b1d42001c8edd36a8d70721aad1e442"

require linux-hardkernel.inc

O_KERNEL_CONFIG_odroid-xu3  = "odroid-xu3"
O_KERNEL_CONFIG_odroid-xu4  = "odroid-xu4"
O_KERNEL_CONFIG_odroid-xu3-lite  = "odroid-xu3"
O_KERNEL_CONFIG_odroid-hc1  = "odroid-hc1"
O_KERNEL_CONFIG_odroid-c2  = "odroid-c2"
O_KERNEL_CONFIG_odroid-c1  = "odroid-c1"

SRC_URI += "file://${O_KERNEL_CONFIG}/defconfig"

SRC_URI += "file://touchscreen.cfg"
