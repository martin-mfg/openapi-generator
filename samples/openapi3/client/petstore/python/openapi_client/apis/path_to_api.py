import typing_extensions

from openapi_client.paths import PathValues
from openapi_client.apis.paths.user_create_with_array import UserCreateWithArray

PathToApi = typing_extensions.TypedDict(
    'PathToApi',
    {
        PathValues.USER_CREATE_WITH_ARRAY: UserCreateWithArray,
    }
)

path_to_api = PathToApi(
    {
        PathValues.USER_CREATE_WITH_ARRAY: UserCreateWithArray,
    }
)
