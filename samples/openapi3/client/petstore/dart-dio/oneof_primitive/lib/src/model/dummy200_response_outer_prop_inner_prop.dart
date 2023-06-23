//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'dummy200_response_outer_prop_inner_prop.g.dart';

/// Dummy200ResponseOuterPropInnerProp
///
/// Properties:
/// * [myBool] 
@BuiltValue()
abstract class Dummy200ResponseOuterPropInnerProp implements Built<Dummy200ResponseOuterPropInnerProp, Dummy200ResponseOuterPropInnerPropBuilder> {
  @BuiltValueField(wireName: r'myBool')
  bool? get myBool;

  Dummy200ResponseOuterPropInnerProp._();

  factory Dummy200ResponseOuterPropInnerProp([void updates(Dummy200ResponseOuterPropInnerPropBuilder b)]) = _$Dummy200ResponseOuterPropInnerProp;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(Dummy200ResponseOuterPropInnerPropBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Dummy200ResponseOuterPropInnerProp> get serializer => _$Dummy200ResponseOuterPropInnerPropSerializer();
}

class _$Dummy200ResponseOuterPropInnerPropSerializer implements PrimitiveSerializer<Dummy200ResponseOuterPropInnerProp> {
  @override
  final Iterable<Type> types = const [Dummy200ResponseOuterPropInnerProp, _$Dummy200ResponseOuterPropInnerProp];

  @override
  final String wireName = r'Dummy200ResponseOuterPropInnerProp';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Dummy200ResponseOuterPropInnerProp object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.myBool != null) {
      yield r'myBool';
      yield serializers.serialize(
        object.myBool,
        specifiedType: const FullType(bool),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Dummy200ResponseOuterPropInnerProp object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required Dummy200ResponseOuterPropInnerPropBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'myBool':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(bool),
          ) as bool;
          result.myBool = valueDes;
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Dummy200ResponseOuterPropInnerProp deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = Dummy200ResponseOuterPropInnerPropBuilder();
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

