SUMMARY = "Helloworld application"
SECTION = "examples"
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/leon-anavi/hello-world.git;branch=master;tag=8c7c4fc753e8d3caa5496afbe34518d235915ddb"

S = "${WORKDIR}/git"

inherit autotools
