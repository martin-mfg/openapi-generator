package models

// ExampleResponse - dummy
type ExampleResponse struct {

	EmptyString string `json:"emptyString,omitempty"`

	NumberString string `json:"numberString,omitempty"`

	BoolString string `json:"boolString,omitempty"`

	NullString string `json:"nullString,omitempty"`

	ABool bool `json:"aBool,omitempty"`

	Zero int32 `json:"zero,omitempty"`
}
