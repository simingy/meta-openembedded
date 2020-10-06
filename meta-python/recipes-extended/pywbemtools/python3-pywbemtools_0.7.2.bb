SUMMARY = "A set of tools using pywbem"
DESCRIPTION = "A set of tools using pywbem to communicate with WBEM servers"
HOMEPAGE = "https://pywbemtools.readthedocs.io/en/stable/"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=e23fadd6ceef8c618fc1c65191d846fa"

SRC_URI[md5sum] = "54ebb824d7ab231ef1f1e88d8d69ac69"
SRC_URI[sha256sum] = "36d70f7d33498cab626e9a2871ea82e434a2c36fe6c240f400615082965f1e4e"

inherit pypi setuptools3

DEPENDS += " \
    ${PYTHON_PN}-pyyaml-native \
    ${PYTHON_PN}-pywbem-native \
    ${PYTHON_PN}-six-native \
    ${PYTHON_PN}-click-native \
"

RDEPENDS_${PN}_class-target += "\
    ${PYTHON_PN}-ply \
    ${PYTHON_PN}-pyyaml \
    ${PYTHON_PN}-six \
    ${PYTHON_PN}-pywbem \
    ${PYTHON_PN}-click \
    ${PYTHON_PN}-requests \
    ${PYTHON_PN}-prompt-toolkit \
    ${PYTHON_PN}-mock \
    ${PYTHON_PN}-packaging \
    ${PYTHON_PN}-nocasedict \
    ${PYTHON_PN}-yamlloader \
    ${PYTHON_PN}-click-repl \
    ${PYTHON_PN}-click-spinner \
    ${PYTHON_PN}-asciitree \
    ${PYTHON_PN}-tabulate \
    ${PYTHON_PN}-pydicti \
    ${PYTHON_PN}-nocaselist \
    ${PYTHON_PN}-custom-inherit \
"

BBCLASSEXTEND = "native"
