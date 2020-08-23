SUMMARY = "A full-featured console (xterm et al.) user interface library"
HOMEPAGE = "http://urwid.org/"
LICENSE = "LGPLv2.1 & LGPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=243b725d71bb5df4a1e5920b344b86ad"

SRC_URI[md5sum] = "dedcee68e4285a940778ef7f8b15ef3a"
SRC_URI[sha256sum] = "7870866e35b00b71b0c9ccdd1281c8e7fac3806d60b9c1075c95dd5dad88d526"

S = "${WORKDIR}/urwid-${PV}"

inherit  pypi setuptools3
RDEPENDS_${PN} += "python3-codecs python3-core python3-curses python3-fcntl python3-io python3-math python3-numbers python3-shell python3-terminal"
