//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:json_annotation/json_annotation.dart';

part 'node.g.dart';


@JsonSerializable(
  checked: true,
  createToJson: true,
  disallowUnrecognizedKeys: false,
  explicitToJson: true,
)
class Node {
  /// Returns a new [Node] instance.
  Node({

     this.left,

     this.right,
  });

  @JsonKey(
    
    name: r'left',
    required: false,
    includeIfNull: false
  )


  final Node? left;



  @JsonKey(
    
    name: r'right',
    required: false,
    includeIfNull: false
  )


  final Node? right;



  @override
  bool operator ==(Object other) => identical(this, other) || other is Node &&
     other.left == left &&
     other.right == right;

  @override
  int get hashCode =>
    left.hashCode +
    right.hashCode;

  factory Node.fromJson(Map<String, dynamic> json) => _$NodeFromJson(json);

  Map<String, dynamic> toJson() => _$NodeToJson(this);

  @override
  String toString() {
    return toJson().toString();
  }

}

