@isTest
private class OASDummy200ResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASDummy200Response dummy200Response1 = OASDummy200Response.getExample();
        OASDummy200Response dummy200Response2 = dummy200Response1;
        OASDummy200Response dummy200Response3 = new OASDummy200Response();
        OASDummy200Response dummy200Response4 = dummy200Response3;

        System.assert(dummy200Response1.equals(dummy200Response2));
        System.assert(dummy200Response2.equals(dummy200Response1));
        System.assert(dummy200Response1.equals(dummy200Response1));
        System.assert(dummy200Response3.equals(dummy200Response4));
        System.assert(dummy200Response4.equals(dummy200Response3));
        System.assert(dummy200Response3.equals(dummy200Response3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASDummy200Response dummy200Response1 = OASDummy200Response.getExample();
        OASDummy200Response dummy200Response2 = OASDummy200Response.getExample();
        OASDummy200Response dummy200Response3 = new OASDummy200Response();
        OASDummy200Response dummy200Response4 = new OASDummy200Response();

        System.assert(dummy200Response1.equals(dummy200Response2));
        System.assert(dummy200Response2.equals(dummy200Response1));
        System.assert(dummy200Response3.equals(dummy200Response4));
        System.assert(dummy200Response4.equals(dummy200Response3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASDummy200Response dummy200Response1 = OASDummy200Response.getExample();
        OASDummy200Response dummy200Response2 = new OASDummy200Response();

        System.assertEquals(false, dummy200Response1.equals('foo'));
        System.assertEquals(false, dummy200Response2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASDummy200Response dummy200Response1 = OASDummy200Response.getExample();
        OASDummy200Response dummy200Response2 = new OASDummy200Response();
        OASDummy200Response dummy200Response3;

        System.assertEquals(false, dummy200Response1.equals(dummy200Response3));
        System.assertEquals(false, dummy200Response2.equals(dummy200Response3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASDummy200Response dummy200Response1 = OASDummy200Response.getExample();
        OASDummy200Response dummy200Response2 = new OASDummy200Response();

        System.assertEquals(dummy200Response1.hashCode(), dummy200Response1.hashCode());
        System.assertEquals(dummy200Response2.hashCode(), dummy200Response2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASDummy200Response dummy200Response1 = OASDummy200Response.getExample();
        OASDummy200Response dummy200Response2 = OASDummy200Response.getExample();
        OASDummy200Response dummy200Response3 = new OASDummy200Response();
        OASDummy200Response dummy200Response4 = new OASDummy200Response();

        System.assert(dummy200Response1.equals(dummy200Response2));
        System.assert(dummy200Response3.equals(dummy200Response4));
        System.assertEquals(dummy200Response1.hashCode(), dummy200Response2.hashCode());
        System.assertEquals(dummy200Response3.hashCode(), dummy200Response4.hashCode());
    }
}
