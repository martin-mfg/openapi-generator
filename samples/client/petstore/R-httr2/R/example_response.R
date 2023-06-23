#' Create a new ExampleResponse
#'
#' @description
#' dummy
#'
#' @docType class
#' @title ExampleResponse
#' @description ExampleResponse Class
#' @format An \code{R6Class} generator object
#' @field emptyString  character [optional]
#' @field numberString  character [optional]
#' @field boolString  character [optional]
#' @field nullString  character [optional]
#' @field aBool  character [optional]
#' @field zero  integer [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
ExampleResponse <- R6::R6Class(
  "ExampleResponse",
  public = list(
    `emptyString` = NULL,
    `numberString` = NULL,
    `boolString` = NULL,
    `nullString` = NULL,
    `aBool` = NULL,
    `zero` = NULL,
    #' Initialize a new ExampleResponse class.
    #'
    #' @description
    #' Initialize a new ExampleResponse class.
    #'
    #' @param emptyString emptyString. Default to "".
    #' @param numberString numberString. Default to "42".
    #' @param boolString boolString. Default to "false".
    #' @param nullString nullString. Default to "null".
    #' @param aBool aBool. Default to FALSE.
    #' @param zero zero. Default to 0.
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`emptyString` = "", `numberString` = "42", `boolString` = "false", `nullString` = "null", `aBool` = FALSE, `zero` = 0, ...) {
      if (!is.null(`emptyString`)) {
        if (!(is.character(`emptyString`) && length(`emptyString`) == 1)) {
          stop(paste("Error! Invalid data for `emptyString`. Must be a string:", `emptyString`))
        }
        self$`emptyString` <- `emptyString`
      }
      if (!is.null(`numberString`)) {
        if (!(is.character(`numberString`) && length(`numberString`) == 1)) {
          stop(paste("Error! Invalid data for `numberString`. Must be a string:", `numberString`))
        }
        self$`numberString` <- `numberString`
      }
      if (!is.null(`boolString`)) {
        if (!(is.character(`boolString`) && length(`boolString`) == 1)) {
          stop(paste("Error! Invalid data for `boolString`. Must be a string:", `boolString`))
        }
        self$`boolString` <- `boolString`
      }
      if (!is.null(`nullString`)) {
        if (!(is.character(`nullString`) && length(`nullString`) == 1)) {
          stop(paste("Error! Invalid data for `nullString`. Must be a string:", `nullString`))
        }
        self$`nullString` <- `nullString`
      }
      if (!is.null(`aBool`)) {
        if (!(is.logical(`aBool`) && length(`aBool`) == 1)) {
          stop(paste("Error! Invalid data for `aBool`. Must be a boolean:", `aBool`))
        }
        self$`aBool` <- `aBool`
      }
      if (!is.null(`zero`)) {
        if (!(is.numeric(`zero`) && length(`zero`) == 1)) {
          stop(paste("Error! Invalid data for `zero`. Must be an integer:", `zero`))
        }
        self$`zero` <- `zero`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ExampleResponse in JSON format
    #' @export
    toJSON = function() {
      ExampleResponseObject <- list()
      if (!is.null(self$`emptyString`)) {
        ExampleResponseObject[["emptyString"]] <-
          self$`emptyString`
      }
      if (!is.null(self$`numberString`)) {
        ExampleResponseObject[["numberString"]] <-
          self$`numberString`
      }
      if (!is.null(self$`boolString`)) {
        ExampleResponseObject[["boolString"]] <-
          self$`boolString`
      }
      if (!is.null(self$`nullString`)) {
        ExampleResponseObject[["nullString"]] <-
          self$`nullString`
      }
      if (!is.null(self$`aBool`)) {
        ExampleResponseObject[["aBool"]] <-
          self$`aBool`
      }
      if (!is.null(self$`zero`)) {
        ExampleResponseObject[["zero"]] <-
          self$`zero`
      }
      ExampleResponseObject
    },
    #' Deserialize JSON string into an instance of ExampleResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of ExampleResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ExampleResponse
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`emptyString`)) {
        self$`emptyString` <- this_object$`emptyString`
      }
      if (!is.null(this_object$`numberString`)) {
        self$`numberString` <- this_object$`numberString`
      }
      if (!is.null(this_object$`boolString`)) {
        self$`boolString` <- this_object$`boolString`
      }
      if (!is.null(this_object$`nullString`)) {
        self$`nullString` <- this_object$`nullString`
      }
      if (!is.null(this_object$`aBool`)) {
        self$`aBool` <- this_object$`aBool`
      }
      if (!is.null(this_object$`zero`)) {
        self$`zero` <- this_object$`zero`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return ExampleResponse in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`emptyString`)) {
          sprintf(
          '"emptyString":
            "%s"
                    ',
          self$`emptyString`
          )
        },
        if (!is.null(self$`numberString`)) {
          sprintf(
          '"numberString":
            "%s"
                    ',
          self$`numberString`
          )
        },
        if (!is.null(self$`boolString`)) {
          sprintf(
          '"boolString":
            "%s"
                    ',
          self$`boolString`
          )
        },
        if (!is.null(self$`nullString`)) {
          sprintf(
          '"nullString":
            "%s"
                    ',
          self$`nullString`
          )
        },
        if (!is.null(self$`aBool`)) {
          sprintf(
          '"aBool":
            %s
                    ',
          tolower(self$`aBool`)
          )
        },
        if (!is.null(self$`zero`)) {
          sprintf(
          '"zero":
            %d
                    ',
          self$`zero`
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of ExampleResponse
    #'
    #' @description
    #' Deserialize JSON string into an instance of ExampleResponse
    #'
    #' @param input_json the JSON input
    #' @return the instance of ExampleResponse
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`emptyString` <- this_object$`emptyString`
      self$`numberString` <- this_object$`numberString`
      self$`boolString` <- this_object$`boolString`
      self$`nullString` <- this_object$`nullString`
      self$`aBool` <- this_object$`aBool`
      self$`zero` <- this_object$`zero`
      self
    },
    #' Validate JSON input with respect to ExampleResponse
    #'
    #' @description
    #' Validate JSON input with respect to ExampleResponse and throw an exception if invalid
    #'
    #' @param input the JSON input
    #' @export
    validateJSON = function(input) {
      input_json <- jsonlite::fromJSON(input)
    },
    #' To string (JSON format)
    #'
    #' @description
    #' To string (JSON format)
    #'
    #' @return String representation of ExampleResponse
    #' @export
    toString = function() {
      self$toJSONString()
    },
    #' Return true if the values in all fields are valid.
    #'
    #' @description
    #' Return true if the values in all fields are valid.
    #'
    #' @return true if the values in all fields are valid.
    #' @export
    isValid = function() {
      TRUE
    },
    #' Return a list of invalid fields (if any).
    #'
    #' @description
    #' Return a list of invalid fields (if any).
    #'
    #' @return A list of invalid fields (if any).
    #' @export
    getInvalidFields = function() {
      invalid_fields <- list()
      invalid_fields
    },
    #' Print the object
    #'
    #' @description
    #' Print the object
    #'
    #' @export
    print = function() {
      print(jsonlite::prettify(self$toJSONString()))
      invisible(self)
    }
  ),
  # Lock the class to prevent modifications to the method or field
  lock_class = TRUE
)
## Uncomment below to unlock the class to allow modifications of the method or field
# ExampleResponse$unlock()
#
## Below is an example to define the print function
# ExampleResponse$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# ExampleResponse$lock()

