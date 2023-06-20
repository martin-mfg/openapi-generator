//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_collection/built_collection.dart';
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'example_response.g.dart';

/// dummy
///
/// Properties:
/// * [myOnlyProperty] 
@BuiltValue()
abstract class ExampleResponse implements Built<ExampleResponse, ExampleResponseBuilder> {
  @BuiltValueField(wireName: r'myOnlyProperty')
  BuiltSet<num>? get myOnlyProperty;

  ExampleResponse._();

  factory ExampleResponse([void updates(ExampleResponseBuilder b)]) = _$ExampleResponse;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(ExampleResponseBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<ExampleResponse> get serializer => _$ExampleResponseSerializer();
}

class _$ExampleResponseSerializer implements PrimitiveSerializer<ExampleResponse> {
  @override
  final Iterable<Type> types = const [ExampleResponse, _$ExampleResponse];

  @override
  final String wireName = r'ExampleResponse';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    ExampleResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.myOnlyProperty != null) {
      yield r'myOnlyProperty';
      yield serializers.serialize(
        object.myOnlyProperty,
        specifiedType: const FullType(BuiltSet, [FullType(num)]),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    ExampleResponse object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required ExampleResponseBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'myOnlyProperty':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(BuiltSet, [FullType(num)]),
          ) as BuiltSet<num>;
          result.myOnlyProperty.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  ExampleResponse deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = ExampleResponseBuilder();
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

