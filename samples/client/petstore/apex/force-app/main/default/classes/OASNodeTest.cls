@isTest
private class OASNodeTest {
    @isTest
    private static void equalsSameInstance() {
        OASNode node1 = OASNode.getExample();
        OASNode node2 = node1;
        OASNode node3 = new OASNode();
        OASNode node4 = node3;

        System.assert(node1.equals(node2));
        System.assert(node2.equals(node1));
        System.assert(node1.equals(node1));
        System.assert(node3.equals(node4));
        System.assert(node4.equals(node3));
        System.assert(node3.equals(node3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASNode node1 = OASNode.getExample();
        OASNode node2 = OASNode.getExample();
        OASNode node3 = new OASNode();
        OASNode node4 = new OASNode();

        System.assert(node1.equals(node2));
        System.assert(node2.equals(node1));
        System.assert(node3.equals(node4));
        System.assert(node4.equals(node3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASNode node1 = OASNode.getExample();
        OASNode node2 = new OASNode();

        System.assertEquals(false, node1.equals('foo'));
        System.assertEquals(false, node2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASNode node1 = OASNode.getExample();
        OASNode node2 = new OASNode();
        OASNode node3;

        System.assertEquals(false, node1.equals(node3));
        System.assertEquals(false, node2.equals(node3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASNode node1 = OASNode.getExample();
        OASNode node2 = new OASNode();

        System.assertEquals(node1.hashCode(), node1.hashCode());
        System.assertEquals(node2.hashCode(), node2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASNode node1 = OASNode.getExample();
        OASNode node2 = OASNode.getExample();
        OASNode node3 = new OASNode();
        OASNode node4 = new OASNode();

        System.assert(node1.equals(node2));
        System.assert(node3.equals(node4));
        System.assertEquals(node1.hashCode(), node2.hashCode());
        System.assertEquals(node3.hashCode(), node4.hashCode());
    }
}
