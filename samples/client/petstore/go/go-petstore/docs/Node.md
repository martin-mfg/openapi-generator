# Node

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**Left** | Pointer to [**Node**](Node.md) |  | [optional] 
**Right** | Pointer to [**Node**](Node.md) |  | [optional] 

## Methods

### NewNode

`func NewNode() *Node`

NewNode instantiates a new Node object
This constructor will assign default values to properties that have it defined,
and makes sure properties required by API are set, but the set of arguments
will change when the set of required properties is changed

### NewNodeWithDefaults

`func NewNodeWithDefaults() *Node`

NewNodeWithDefaults instantiates a new Node object
This constructor will only assign default values to properties that have it defined,
but it doesn't guarantee that properties required by API are set

### GetLeft

`func (o *Node) GetLeft() Node`

GetLeft returns the Left field if non-nil, zero value otherwise.

### GetLeftOk

`func (o *Node) GetLeftOk() (*Node, bool)`

GetLeftOk returns a tuple with the Left field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetLeft

`func (o *Node) SetLeft(v Node)`

SetLeft sets Left field to given value.

### HasLeft

`func (o *Node) HasLeft() bool`

HasLeft returns a boolean if a field has been set.

### GetRight

`func (o *Node) GetRight() Node`

GetRight returns the Right field if non-nil, zero value otherwise.

### GetRightOk

`func (o *Node) GetRightOk() (*Node, bool)`

GetRightOk returns a tuple with the Right field if it's non-nil, zero value otherwise
and a boolean to check if the value has been set.

### SetRight

`func (o *Node) SetRight(v Node)`

SetRight sets Right field to given value.

### HasRight

`func (o *Node) HasRight() bool`

HasRight returns a boolean if a field has been set.


[[Back to Model list]](../README.md#documentation-for-models) [[Back to API list]](../README.md#documentation-for-api-endpoints) [[Back to README]](../README.md)


