#' Create a new Node
#'
#' @description
#' dummy
#'
#' @docType class
#' @title Node
#' @description Node Class
#' @format An \code{R6Class} generator object
#' @field left  \link{Node} [optional]
#' @field right  \link{Node} [optional]
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
Node <- R6::R6Class(
  "Node",
  public = list(
    `left` = NULL,
    `right` = NULL,
    #' Initialize a new Node class.
    #'
    #' @description
    #' Initialize a new Node class.
    #'
    #' @param left left
    #' @param right right
    #' @param ... Other optional arguments.
    #' @export
    initialize = function(`left` = NULL, `right` = NULL, ...) {
      if (!is.null(`left`)) {
        stopifnot(R6::is.R6(`left`))
        self$`left` <- `left`
      }
      if (!is.null(`right`)) {
        stopifnot(R6::is.R6(`right`))
        self$`right` <- `right`
      }
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Node in JSON format
    #' @export
    toJSON = function() {
      NodeObject <- list()
      if (!is.null(self$`left`)) {
        NodeObject[["left"]] <-
          self$`left`$toJSON()
      }
      if (!is.null(self$`right`)) {
        NodeObject[["right"]] <-
          self$`right`$toJSON()
      }
      NodeObject
    },
    #' Deserialize JSON string into an instance of Node
    #'
    #' @description
    #' Deserialize JSON string into an instance of Node
    #'
    #' @param input_json the JSON input
    #' @return the instance of Node
    #' @export
    fromJSON = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      if (!is.null(this_object$`left`)) {
        `left_object` <- Node$new()
        `left_object`$fromJSON(jsonlite::toJSON(this_object$`left`, auto_unbox = TRUE, digits = NA))
        self$`left` <- `left_object`
      }
      if (!is.null(this_object$`right`)) {
        `right_object` <- Node$new()
        `right_object`$fromJSON(jsonlite::toJSON(this_object$`right`, auto_unbox = TRUE, digits = NA))
        self$`right` <- `right_object`
      }
      self
    },
    #' To JSON string
    #'
    #' @description
    #' To JSON String
    #'
    #' @return Node in JSON format
    #' @export
    toJSONString = function() {
      jsoncontent <- c(
        if (!is.null(self$`left`)) {
          sprintf(
          '"left":
          %s
          ',
          jsonlite::toJSON(self$`left`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        },
        if (!is.null(self$`right`)) {
          sprintf(
          '"right":
          %s
          ',
          jsonlite::toJSON(self$`right`$toJSON(), auto_unbox = TRUE, digits = NA)
          )
        }
      )
      jsoncontent <- paste(jsoncontent, collapse = ",")
      json_string <- as.character(jsonlite::minify(paste("{", jsoncontent, "}", sep = "")))
    },
    #' Deserialize JSON string into an instance of Node
    #'
    #' @description
    #' Deserialize JSON string into an instance of Node
    #'
    #' @param input_json the JSON input
    #' @return the instance of Node
    #' @export
    fromJSONString = function(input_json) {
      this_object <- jsonlite::fromJSON(input_json)
      self$`left` <- Node$new()$fromJSON(jsonlite::toJSON(this_object$`left`, auto_unbox = TRUE, digits = NA))
      self$`right` <- Node$new()$fromJSON(jsonlite::toJSON(this_object$`right`, auto_unbox = TRUE, digits = NA))
      self
    },
    #' Validate JSON input with respect to Node
    #'
    #' @description
    #' Validate JSON input with respect to Node and throw an exception if invalid
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
    #' @return String representation of Node
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
# Node$unlock()
#
## Below is an example to define the print function
# Node$set("public", "print", function(...) {
#   print(jsonlite::prettify(self$toJSONString()))
#   invisible(self)
# })
## Uncomment below to lock the class to prevent modifications to the method or field
# Node$lock()

