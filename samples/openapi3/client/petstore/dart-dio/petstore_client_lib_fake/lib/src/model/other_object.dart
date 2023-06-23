//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/example_response.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'other_object.g.dart';

/// dummy
///
/// Properties:
/// * [myOnlyProperty2] 
@BuiltValue()
abstract class OtherObject implements Built<OtherObject, OtherObjectBuilder> {
  @BuiltValueField(wireName: r'myOnlyProperty2')
  ExampleResponse? get myOnlyProperty2;

  OtherObject._();

  factory OtherObject([void updates(OtherObjectBuilder b)]) = _$OtherObject;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(OtherObjectBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<OtherObject> get serializer => _$OtherObjectSerializer();
}

class _$OtherObjectSerializer implements PrimitiveSerializer<OtherObject> {
  @override
  final Iterable<Type> types = const [OtherObject, _$OtherObject];

  @override
  final String wireName = r'OtherObject';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    OtherObject object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.myOnlyProperty2 != null) {
      yield r'myOnlyProperty2';
      yield serializers.serialize(
        object.myOnlyProperty2,
        specifiedType: const FullType(ExampleResponse),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    OtherObject object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required OtherObjectBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'myOnlyProperty2':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(ExampleResponse),
          ) as ExampleResponse;
          result.myOnlyProperty2.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  OtherObject deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = OtherObjectBuilder();
    final serializedList = (serialized as Iterable<Object?>).toList();
    final unhandled = <Object?>[];
    _deserializeProperties(
      serializers,
      serialized,
      specifiedType: specifiedType,
      serializedList: serializedList,
      unhandled: unhandled,
      result: result,
    );
    return result.build();
  }
}

