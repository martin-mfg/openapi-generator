//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:openapi/src/model/dummy200_response_outer_prop_inner_prop.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'dummy200_response_outer_prop.g.dart';

/// Dummy200ResponseOuterProp
///
/// Properties:
/// * [innerProp] 
@BuiltValue()
abstract class Dummy200ResponseOuterProp implements Built<Dummy200ResponseOuterProp, Dummy200ResponseOuterPropBuilder> {
  @BuiltValueField(wireName: r'innerProp')
  Dummy200ResponseOuterPropInnerProp? get innerProp;

  Dummy200ResponseOuterProp._();

  factory Dummy200ResponseOuterProp([void updates(Dummy200ResponseOuterPropBuilder b)]) = _$Dummy200ResponseOuterProp;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(Dummy200ResponseOuterPropBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Dummy200ResponseOuterProp> get serializer => _$Dummy200ResponseOuterPropSerializer();
}

class _$Dummy200ResponseOuterPropSerializer implements PrimitiveSerializer<Dummy200ResponseOuterProp> {
  @override
  final Iterable<Type> types = const [Dummy200ResponseOuterProp, _$Dummy200ResponseOuterProp];

  @override
  final String wireName = r'Dummy200ResponseOuterProp';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Dummy200ResponseOuterProp object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.innerProp != null) {
      yield r'innerProp';
      yield serializers.serialize(
        object.innerProp,
        specifiedType: const FullType(Dummy200ResponseOuterPropInnerProp),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Dummy200ResponseOuterProp object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required Dummy200ResponseOuterPropBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'innerProp':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Dummy200ResponseOuterPropInnerProp),
          ) as Dummy200ResponseOuterPropInnerProp;
          result.innerProp.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Dummy200ResponseOuterProp deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = Dummy200ResponseOuterPropBuilder();
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

