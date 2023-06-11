
# Table `ExampleResponse`
(mapped from: ExampleResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**myOnlyProperty** | `One-To-Many` | `----` | `----`  | **kotlin.Array&lt;kotlin.Boolean&gt;** |  |  [optional]


# **Table `ExampleResponseMyOnlyProperty`**
(mapped from: ExampleResponseMyOnlyProperty)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
exampleResponse | exampleResponse | long | | kotlin.Long | Primary Key | *one*
myOnlyProperty | myOnlyProperty | boolean | | kotlin.Boolean | Foreign Key | *many*



