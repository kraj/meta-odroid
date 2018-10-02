# Samsung exynos

SOC_FAMILY = "samsung:exynos"
require conf/machine/include/soc-family.inc

SERIAL_CONSOLE ?= "115200 ttySAC2"
UBOOT_CONSOLE = "console=ttySAC2,115200"
