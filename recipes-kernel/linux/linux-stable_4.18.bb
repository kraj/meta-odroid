FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

LINUX_VERSION ?= "4.18.9"
KBRANCH ?= "linux-4.18.y"
SRCREV ?= "86e014f514f979312cae23a15284cb81d1ee7336"

require linux-stable.inc

SRCREV_meta ?= "63ea2052ace129caa22c4b5b88c316bde63f64eb"

# local kernel cache location
#SRC_URI_append = " git://github.com/akuster/yocto-kernel-cache;type=kmeta;name=meta;branch=stable-4.18;destsuffix=${KMETA}"

SRC_URI_append = " git://git.yoctoproject.org/yocto-kernel-cache;type=kmeta;name=meta;branch=yocto-4.18;destsuffix=${KMETA}"
SRC_URI_append = " file://odroid-kmeta;type=kmeta;name=odroid-kmeta;destsuffix=odroid-kmeta"

SRC_URI_append = " file://odroid.scc"

LIC_FILES_CHKSUM = "file://COPYING;md5=bbea815ee2795b2f4230826c0c6b8814"

DEPENDS += "openssl-native util-linux-native"

KMETA = "kernel-meta"
KMACHINE_odroid-hc1 = "odroid-hc1"
KMACHINE_odroid-xu3 = "odroid-xu3"
KMACHINE_odroid-xu3-lite = "odroid-xu3-lite"
KMACHINE_odroid-xu4 = "odroid-xu4"
KMACHINE_odroid-c2 = "odroid-c2"
KMACHINE_odroid-c1 = "odroid-c1"

#KERNEL_FEATURES_append = " ${@bb.utils.contains("DISTRO_FEATURES", "x11", " features/graphics/fb.scc", "" ,d)}"
