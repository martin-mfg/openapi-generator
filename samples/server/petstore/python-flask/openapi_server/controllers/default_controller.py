import connexion
import six
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.example_response import ExampleResponse  # noqa: E501
from openapi_server.models.node import Node  # noqa: E501
from openapi_server import util


def dummy():  # noqa: E501
    """dummy

    dummy # noqa: E501


    :rtype: Union[ExampleResponse, Tuple[ExampleResponse, int], Tuple[ExampleResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
