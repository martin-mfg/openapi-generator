
# Table `ExampleResponse`
(mapped from: ExampleResponse)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
**myOnlyProperty** | `One-To-Many` | `----` | `----`  | [**kotlin.collections.MutableSet&lt;java.math.BigDecimal&gt;**](java.math.BigDecimal.md) |  |  [optional]


# **Table `ExampleResponseMyOnlyProperty`**
(mapped from: ExampleResponseMyOnlyProperty)

## Properties
Name | Mapping | SQL Type | Default | Type | Description | Notes
---- | ------- | -------- | ------- | ---- | ----------- | -----
exampleResponse | exampleResponse | long | | kotlin.Long | Primary Key | *one*
myOnlyProperty | myOnlyProperty | decimal | | java.math.BigDecimal | Foreign Key | *many*



