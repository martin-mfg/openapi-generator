//
// AUTO-GENERATED FILE, DO NOT MODIFY!
//

// ignore_for_file: unused_element
import 'package:built_value/built_value.dart';
import 'package:built_value/serializer.dart';

part 'node.g.dart';

/// dummy
///
/// Properties:
/// * [left] 
/// * [right] 
@BuiltValue()
abstract class Node implements Built<Node, NodeBuilder> {
  @BuiltValueField(wireName: r'left')
  Node? get left;

  @BuiltValueField(wireName: r'right')
  Node? get right;

  Node._();

  factory Node([void updates(NodeBuilder b)]) = _$Node;

  @BuiltValueHook(initializeBuilder: true)
  static void _defaults(NodeBuilder b) => b;

  @BuiltValueSerializer(custom: true)
  static Serializer<Node> get serializer => _$NodeSerializer();
}

class _$NodeSerializer implements PrimitiveSerializer<Node> {
  @override
  final Iterable<Type> types = const [Node, _$Node];

  @override
  final String wireName = r'Node';

  Iterable<Object?> _serializeProperties(
    Serializers serializers,
    Node object, {
    FullType specifiedType = FullType.unspecified,
  }) sync* {
    if (object.left != null) {
      yield r'left';
      yield serializers.serialize(
        object.left,
        specifiedType: const FullType(Node),
      );
    }
    if (object.right != null) {
      yield r'right';
      yield serializers.serialize(
        object.right,
        specifiedType: const FullType(Node),
      );
    }
  }

  @override
  Object serialize(
    Serializers serializers,
    Node object, {
    FullType specifiedType = FullType.unspecified,
  }) {
    return _serializeProperties(serializers, object, specifiedType: specifiedType).toList();
  }

  void _deserializeProperties(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
    required List<Object?> serializedList,
    required NodeBuilder result,
    required List<Object?> unhandled,
  }) {
    for (var i = 0; i < serializedList.length; i += 2) {
      final key = serializedList[i] as String;
      final value = serializedList[i + 1];
      switch (key) {
        case r'left':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Node),
          ) as Node;
          result.left.replace(valueDes);
          break;
        case r'right':
          final valueDes = serializers.deserialize(
            value,
            specifiedType: const FullType(Node),
          ) as Node;
          result.right.replace(valueDes);
          break;
        default:
          unhandled.add(key);
          unhandled.add(value);
          break;
      }
    }
  }

  @override
  Node deserialize(
    Serializers serializers,
    Object serialized, {
    FullType specifiedType = FullType.unspecified,
  }) {
    final result = NodeBuilder();
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

