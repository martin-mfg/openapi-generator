import typing_extensions

from openapi_client.apis.tags import TagValues
from openapi_client.apis.tags.user_api import UserApi

TagToApi = typing_extensions.TypedDict(
    'TagToApi',
    {
        TagValues.USER: UserApi,
    }
)

tag_to_api = TagToApi(
    {
        TagValues.USER: UserApi,
    }
)
