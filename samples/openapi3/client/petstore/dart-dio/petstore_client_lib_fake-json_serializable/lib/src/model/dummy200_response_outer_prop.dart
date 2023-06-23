//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/dummy200_response_outer_prop_inner_prop.dart';
import 'package:json_annotation/json_annotation.dart';

part 'dummy200_response_outer_prop.g.dart';


@JsonSerializable(
  checked: true,
  createToJson: true,
  disallowUnrecognizedKeys: false,
  explicitToJson: true,
)
class Dummy200ResponseOuterProp {
  /// Returns a new [Dummy200ResponseOuterProp] instance.
  Dummy200ResponseOuterProp({

     this.innerProp,
  });

  @JsonKey(
    
    name: r'innerProp',
    required: false,
    includeIfNull: false
  )


  final Dummy200ResponseOuterPropInnerProp? innerProp;



  @override
  bool operator ==(Object other) => identical(this, other) || other is Dummy200ResponseOuterProp &&
     other.innerProp == innerProp;

  @override
  int get hashCode =>
    innerProp.hashCode;

  factory Dummy200ResponseOuterProp.fromJson(Map<String, dynamic> json) => _$Dummy200ResponseOuterPropFromJson(json);

  Map<String, dynamic> toJson() => _$Dummy200ResponseOuterPropToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }

}

