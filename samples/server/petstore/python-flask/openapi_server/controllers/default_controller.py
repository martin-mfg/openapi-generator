import connexion
import six
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.example_response import ExampleResponse  # noqa: E501
from openapi_server import util


def example_some_method_get():  # noqa: E501
    """example_some_method_get

     # noqa: E501


    :rtype: Union[ExampleResponse, Tuple[ExampleResponse, int], Tuple[ExampleResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
