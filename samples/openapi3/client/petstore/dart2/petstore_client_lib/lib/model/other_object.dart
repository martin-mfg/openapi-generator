//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//
// @dart=2.12

// ignore_for_file: unused_element, unused_import
// ignore_for_file: always_put_required_named_parameters_first
// ignore_for_file: constant_identifier_names
// ignore_for_file: lines_longer_than_80_chars

part of openapi.api;

class OtherObject {
  /// Returns a new [OtherObject] instance.
  OtherObject({
    this.myOnlyProperty2,
  });

  ///
  /// Please note: This property should have been non-nullable! Since the specification file
  /// does not include a default value (using the "default:" property), however, the generated
  /// source code must fall back to having a nullable type.
  /// Consider adding a "default:" property in the specification file to hide this note.
  ///
  ExampleResponse? myOnlyProperty2;

  @override
  bool operator ==(Object other) => identical(this, other) || other is OtherObject &&
     other.myOnlyProperty2 == myOnlyProperty2;

  @override
  int get hashCode =>
    // ignore: unnecessary_parenthesis
    (myOnlyProperty2 == null ? 0 : myOnlyProperty2!.hashCode);

  @override
  String toString() => 'OtherObject[myOnlyProperty2=$myOnlyProperty2]';

  Map<String, dynamic> toJson() {
    final json = <String, dynamic>{};
    if (this.myOnlyProperty2 != null) {
      json[r'myOnlyProperty2'] = this.myOnlyProperty2;
    } else {
      json[r'myOnlyProperty2'] = null;
    }
    return json;
  }

  /// Returns a new [OtherObject] instance and imports its values from
  /// [value] if it's a [Map], null otherwise.
  // ignore: prefer_constructors_over_static_methods
  static OtherObject? fromJson(dynamic value) {
    if (value is Map) {
      final json = value.cast<String, dynamic>();

      // Ensure that the map contains the required keys.
      // Note 1: the values aren't checked for validity beyond being non-null.
      // Note 2: this code is stripped in release mode!
      assert(() {
        requiredKeys.forEach((key) {
          assert(json.containsKey(key), 'Required key "OtherObject[$key]" is missing from JSON.');
          assert(json[key] != null, 'Required key "OtherObject[$key]" has a null value in JSON.');
        });
        return true;
      }());

      return OtherObject(
        myOnlyProperty2: ExampleResponse.fromJson(json[r'myOnlyProperty2']),
      );
    }
    return null;
  }

  static List<OtherObject> listFromJson(dynamic json, {bool growable = false,}) {
    final result = <OtherObject>[];
    if (json is List && json.isNotEmpty) {
      for (final row in json) {
        final value = OtherObject.fromJson(row);
        if (value != null) {
          result.add(value);
        }
      }
    }
    return result.toList(growable: growable);
  }

  static Map<String, OtherObject> mapFromJson(dynamic json) {
    final map = <String, OtherObject>{};
    if (json is Map && json.isNotEmpty) {
      json = json.cast<String, dynamic>(); // ignore: parameter_assignments
      for (final entry in json.entries) {
        final value = OtherObject.fromJson(entry.value);
        if (value != null) {
          map[entry.key] = value;
        }
      }
    }
    return map;
  }

  // maps a json object with a list of OtherObject-objects as value to a dart map
  static Map<String, List<OtherObject>> mapListFromJson(dynamic json, {bool growable = false,}) {
    final map = <String, List<OtherObject>>{};
    if (json is Map && json.isNotEmpty) {
      // ignore: parameter_assignments
      json = json.cast<String, dynamic>();
      for (final entry in json.entries) {
        map[entry.key] = OtherObject.listFromJson(entry.value, growable: growable,);
      }
    }
    return map;
  }

  /// The list of required keys that must be present in a JSON.
  static const requiredKeys = <String>{
  };
}

