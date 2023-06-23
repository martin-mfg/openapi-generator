//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/dummy200_response_outer_prop.dart';
import 'package:json_annotation/json_annotation.dart';

part 'dummy200_response.g.dart';


@JsonSerializable(
  checked: true,
  createToJson: true,
  disallowUnrecognizedKeys: false,
  explicitToJson: true,
)
class Dummy200Response {
  /// Returns a new [Dummy200Response] instance.
  Dummy200Response({

     this.outerProp,
  });

  @JsonKey(
    
    name: r'outerProp',
    required: false,
    includeIfNull: false
  )


  final Dummy200ResponseOuterProp? outerProp;



  @override
  bool operator ==(Object other) => identical(this, other) || other is Dummy200Response &&
     other.outerProp == outerProp;

  @override
  int get hashCode =>
    outerProp.hashCode;

  factory Dummy200Response.fromJson(Map<String, dynamic> json) => _$Dummy200ResponseFromJson(json);

  Map<String, dynamic> toJson() => _$Dummy200ResponseToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }

}

