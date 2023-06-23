//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:json_annotation/json_annotation.dart';

part 'example_response.g.dart';


@JsonSerializable(
  checked: true,
  createToJson: true,
  disallowUnrecognizedKeys: false,
  explicitToJson: true,
)
class ExampleResponse {
  /// Returns a new [ExampleResponse] instance.
  ExampleResponse({

     this.emptyString = '',

     this.numberString = '42',

     this.boolString = 'false',

     this.nullString = 'null',

     this.aBool = false,

     this.zero = 0,
  });

  @JsonKey(
    defaultValue: '',
    name: r'emptyString',
    required: false,
    includeIfNull: false
  )


  final String? emptyString;



  @JsonKey(
    defaultValue: '42',
    name: r'numberString',
    required: false,
    includeIfNull: false
  )


  final String? numberString;



  @JsonKey(
    defaultValue: 'false',
    name: r'boolString',
    required: false,
    includeIfNull: false
  )


  final String? boolString;



  @JsonKey(
    defaultValue: 'null',
    name: r'nullString',
    required: false,
    includeIfNull: false
  )


  final String? nullString;



  @JsonKey(
    defaultValue: false,
    name: r'aBool',
    required: false,
    includeIfNull: false
  )


  final bool? aBool;



  @JsonKey(
    defaultValue: 0,
    name: r'zero',
    required: false,
    includeIfNull: false
  )


  final int? zero;



  @override
  bool operator ==(Object other) => identical(this, other) || other is ExampleResponse &&
     other.emptyString == emptyString &&
     other.numberString == numberString &&
     other.boolString == boolString &&
     other.nullString == nullString &&
     other.aBool == aBool &&
     other.zero == zero;

  @override
  int get hashCode =>
    emptyString.hashCode +
    numberString.hashCode +
    boolString.hashCode +
    nullString.hashCode +
    aBool.hashCode +
    zero.hashCode;

  factory ExampleResponse.fromJson(Map<String, dynamic> json) => _$ExampleResponseFromJson(json);

  Map<String, dynamic> toJson() => _$ExampleResponseToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }

}

