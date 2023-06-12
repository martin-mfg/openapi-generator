import connexion
import six
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server import util


def retrieve_something():  # noqa: E501
    """retrieve_something

    get some object # noqa: E501


    :rtype: Union[int, Tuple[int, int], Tuple[int, int, Dict[str, str]]
    """
    return 'do some magic!'
