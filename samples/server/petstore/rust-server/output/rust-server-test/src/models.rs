#![allow(unused_qualifications)]

use crate::models;
#[cfg(any(feature = "client", feature = "server"))]
use crate::header;

/// dummy
#[derive(Debug, Clone, PartialEq, serde::Serialize, serde::Deserialize)]
#[cfg_attr(feature = "conversion", derive(frunk::LabelledGeneric))]
pub struct ExampleResponse {
    #[serde(rename = "emptyString")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub empty_string: Option<String>,

    #[serde(rename = "numberString")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub number_string: Option<String>,

    #[serde(rename = "boolString")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub bool_string: Option<String>,

    #[serde(rename = "nullString")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub null_string: Option<String>,

    #[serde(rename = "aBool")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub a_bool: Option<bool>,

    #[serde(rename = "zero")]
    #[serde(skip_serializing_if="Option::is_none")]
    pub zero: Option<i32>,

}

impl ExampleResponse {
    #[allow(clippy::new_without_default)]
    pub fn new() -> ExampleResponse {
        ExampleResponse {
            empty_string: Some("".to_string()),
            number_string: Some("42".to_string()),
            bool_string: Some("false".to_string()),
            null_string: Some("null".to_string()),
            a_bool: Some(false),
            zero: Some(0),
        }
    }
}

/// Converts the ExampleResponse value to the Query Parameters representation (style=form, explode=false)
/// specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde serializer
impl std::string::ToString for ExampleResponse {
    fn to_string(&self) -> String {
        let params: Vec<Option<String>> = vec![

            self.empty_string.as_ref().map(|empty_string| {
                vec![
                    "emptyString".to_string(),
                    empty_string.to_string(),
                ].join(",")
            }),


            self.number_string.as_ref().map(|number_string| {
                vec![
                    "numberString".to_string(),
                    number_string.to_string(),
                ].join(",")
            }),


            self.bool_string.as_ref().map(|bool_string| {
                vec![
                    "boolString".to_string(),
                    bool_string.to_string(),
                ].join(",")
            }),


            self.null_string.as_ref().map(|null_string| {
                vec![
                    "nullString".to_string(),
                    null_string.to_string(),
                ].join(",")
            }),


            self.a_bool.as_ref().map(|a_bool| {
                vec![
                    "aBool".to_string(),
                    a_bool.to_string(),
                ].join(",")
            }),


            self.zero.as_ref().map(|zero| {
                vec![
                    "zero".to_string(),
                    zero.to_string(),
                ].join(",")
            }),

        ];

        params.into_iter().flatten().collect::<Vec<_>>().join(",")
    }
}

/// Converts Query Parameters representation (style=form, explode=false) to a ExampleResponse value
/// as specified in https://swagger.io/docs/specification/serialization/
/// Should be implemented in a serde deserializer
impl std::str::FromStr for ExampleResponse {
    type Err = String;

    fn from_str(s: &str) -> std::result::Result<Self, Self::Err> {
        /// An intermediate representation of the struct to use for parsing.
        #[derive(Default)]
        #[allow(dead_code)]
        struct IntermediateRep {
            pub empty_string: Vec<String>,
            pub number_string: Vec<String>,
            pub bool_string: Vec<String>,
            pub null_string: Vec<String>,
            pub a_bool: Vec<bool>,
            pub zero: Vec<i32>,
        }

        let mut intermediate_rep = IntermediateRep::default();

        // Parse into intermediate representation
        let mut string_iter = s.split(',');
        let mut key_result = string_iter.next();

        while key_result.is_some() {
            let val = match string_iter.next() {
                Some(x) => x,
                None => return std::result::Result::Err("Missing value while parsing ExampleResponse".to_string())
            };

            if let Some(key) = key_result {
                #[allow(clippy::match_single_binding)]
                match key {
                    #[allow(clippy::redundant_clone)]
                    "emptyString" => intermediate_rep.empty_string.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "numberString" => intermediate_rep.number_string.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "boolString" => intermediate_rep.bool_string.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "nullString" => intermediate_rep.null_string.push(<String as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "aBool" => intermediate_rep.a_bool.push(<bool as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    #[allow(clippy::redundant_clone)]
                    "zero" => intermediate_rep.zero.push(<i32 as std::str::FromStr>::from_str(val).map_err(|x| x.to_string())?),
                    _ => return std::result::Result::Err("Unexpected key while parsing ExampleResponse".to_string())
                }
            }

            // Get the next key
            key_result = string_iter.next();
        }

        // Use the intermediate representation to return the struct
        std::result::Result::Ok(ExampleResponse {
            empty_string: intermediate_rep.empty_string.into_iter().next(),
            number_string: intermediate_rep.number_string.into_iter().next(),
            bool_string: intermediate_rep.bool_string.into_iter().next(),
            null_string: intermediate_rep.null_string.into_iter().next(),
            a_bool: intermediate_rep.a_bool.into_iter().next(),
            zero: intermediate_rep.zero.into_iter().next(),
        })
    }
}

// Methods for converting between header::IntoHeaderValue<ExampleResponse> and hyper::header::HeaderValue

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<header::IntoHeaderValue<ExampleResponse>> for hyper::header::HeaderValue {
    type Error = String;

    fn try_from(hdr_value: header::IntoHeaderValue<ExampleResponse>) -> std::result::Result<Self, Self::Error> {
        let hdr_value = hdr_value.to_string();
        match hyper::header::HeaderValue::from_str(&hdr_value) {
             std::result::Result::Ok(value) => std::result::Result::Ok(value),
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Invalid header value for ExampleResponse - value: {} is invalid {}",
                     hdr_value, e))
        }
    }
}

#[cfg(any(feature = "client", feature = "server"))]
impl std::convert::TryFrom<hyper::header::HeaderValue> for header::IntoHeaderValue<ExampleResponse> {
    type Error = String;

    fn try_from(hdr_value: hyper::header::HeaderValue) -> std::result::Result<Self, Self::Error> {
        match hdr_value.to_str() {
             std::result::Result::Ok(value) => {
                    match <ExampleResponse as std::str::FromStr>::from_str(value) {
                        std::result::Result::Ok(value) => std::result::Result::Ok(header::IntoHeaderValue(value)),
                        std::result::Result::Err(err) => std::result::Result::Err(
                            format!("Unable to convert header value '{}' into ExampleResponse - {}",
                                value, err))
                    }
             },
             std::result::Result::Err(e) => std::result::Result::Err(
                 format!("Unable to convert header: {:?} to string: {}",
                     hdr_value, e))
        }
    }
}

