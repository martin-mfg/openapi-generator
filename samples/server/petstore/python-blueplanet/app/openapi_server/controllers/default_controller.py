import connexion
import six

from app.openapi_server.models.dummy200_response import Dummy200Response  # noqa: E501
from openapi_server import util


def dummy():  # noqa: E501
    """dummy

    dummy # noqa: E501


    :rtype: Dummy200Response
    """
    return 'do some magic!'
