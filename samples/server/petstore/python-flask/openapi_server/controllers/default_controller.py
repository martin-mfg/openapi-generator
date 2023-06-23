import connexion
import six
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.dummy200_response import Dummy200Response  # noqa: E501
from openapi_server import util


def dummy():  # noqa: E501
    """dummy

    dummy # noqa: E501


    :rtype: Union[Dummy200Response, Tuple[Dummy200Response, int], Tuple[Dummy200Response, int, Dict[str, str]]
    """
    return 'do some magic!'
