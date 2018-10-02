require ${@bb.utils.contains('MACHINE_FEATURES', 'mali', '${BPN}_odroid.inc', '', d)}
