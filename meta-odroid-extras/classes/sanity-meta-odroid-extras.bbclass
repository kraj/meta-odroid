addhandler odroid_extras_bbappend_distrocheck
odroid_extras_bbappend_distrocheck[eventmask] = "bb.event.SanityCheck"
python odroid_extras_bbappend_distrocheck() {
    skip_check = e.data.getVar('SKIP_META_ODROID_EXTRA_SANITY_CHECK') == "1"
    if 'x11' not in e.data.getVar('DISTRO_FEATURES').split() and not skip_check:
        bb.warn("You have included the meta-odroid-extras layer, but \
'x11' has not been enabled in your DISTRO_FEATURES. Some bbappend files \
may not take effect. See the meta-odroid-extras README for details on enabling \
meta-odroid-extras support.")
}
