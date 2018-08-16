FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

require ${@bb.utils.contains('DISTRO_FEATURES', 'x11', '${BPN}-odroid.inc', '', d)}
