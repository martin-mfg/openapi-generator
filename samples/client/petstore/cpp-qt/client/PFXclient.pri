QT += network

HEADERS += \
# Models
    $${PWD}/PFXExampleResponse.h \
    $${PWD}/PFXNode.h \
    $${PWD}/PFXOtherObject.h \
# APIs
    $${PWD}/PFXDefaultApi.h \
# Others
    $${PWD}/PFXHelpers.h \
    $${PWD}/PFXHttpRequest.h \
    $${PWD}/PFXObject.h \
    $${PWD}/PFXEnum.h \
    $${PWD}/PFXHttpFileElement.h \
    $${PWD}/PFXServerConfiguration.h \
    $${PWD}/PFXServerVariable.h \
    $${PWD}/PFXOauth.h

SOURCES += \
# Models
    $${PWD}/PFXExampleResponse.cpp \
    $${PWD}/PFXNode.cpp \
    $${PWD}/PFXOtherObject.cpp \
# APIs
    $${PWD}/PFXDefaultApi.cpp \
# Others
    $${PWD}/PFXHelpers.cpp \
    $${PWD}/PFXHttpRequest.cpp \
    $${PWD}/PFXHttpFileElement.cpp \
    $${PWD}/PFXOauth.cpp
