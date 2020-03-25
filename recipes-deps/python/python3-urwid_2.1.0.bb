SUMMARY = "A full-featured console (xterm et al.) user interface library"
HOMEPAGE = "http://urwid.org/"
LICENSE = "LGPLv2.1 & LGPL"
LIC_FILES_CHKSUM = "file://COPYING;md5=243b725d71bb5df4a1e5920b344b86ad"

SRC_URI[md5sum] = "41010a5951f084f0f4a1112e602d419a"
SRC_URI[sha256sum] = "0896f36060beb6bf3801cb554303fef336a79661401797551ba106d23ab4cd86"

S = "${WORKDIR}/urwid-${PV}"

inherit  pypi setuptools3
RDEPENDS_${PN} += "python3-codecs python3-core python3-curses python3-fcntl python3-io python3-math python3-numbers python3-shell python3-terminal"
