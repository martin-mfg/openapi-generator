@isTest
private class OASExampleResponseTest {
    @isTest
    private static void equalsSameInstance() {
        OASExampleResponse exampleResponse1 = OASExampleResponse.getExample();
        OASExampleResponse exampleResponse2 = exampleResponse1;
        OASExampleResponse exampleResponse3 = new OASExampleResponse();
        OASExampleResponse exampleResponse4 = exampleResponse3;

        System.assert(exampleResponse1.equals(exampleResponse2));
        System.assert(exampleResponse2.equals(exampleResponse1));
        System.assert(exampleResponse1.equals(exampleResponse1));
        System.assert(exampleResponse3.equals(exampleResponse4));
        System.assert(exampleResponse4.equals(exampleResponse3));
        System.assert(exampleResponse3.equals(exampleResponse3));
    }

    @isTest
    private static void equalsIdenticalInstance() {
        OASExampleResponse exampleResponse1 = OASExampleResponse.getExample();
        OASExampleResponse exampleResponse2 = OASExampleResponse.getExample();
        OASExampleResponse exampleResponse3 = new OASExampleResponse();
        OASExampleResponse exampleResponse4 = new OASExampleResponse();

        System.assert(exampleResponse1.equals(exampleResponse2));
        System.assert(exampleResponse2.equals(exampleResponse1));
        System.assert(exampleResponse3.equals(exampleResponse4));
        System.assert(exampleResponse4.equals(exampleResponse3));
    }

    @isTest
    private static void notEqualsDifferentType() {
        OASExampleResponse exampleResponse1 = OASExampleResponse.getExample();
        OASExampleResponse exampleResponse2 = new OASExampleResponse();

        System.assertEquals(false, exampleResponse1.equals('foo'));
        System.assertEquals(false, exampleResponse2.equals('foo'));
    }

    @isTest
    private static void notEqualsNull() {
        OASExampleResponse exampleResponse1 = OASExampleResponse.getExample();
        OASExampleResponse exampleResponse2 = new OASExampleResponse();
        OASExampleResponse exampleResponse3;

        System.assertEquals(false, exampleResponse1.equals(exampleResponse3));
        System.assertEquals(false, exampleResponse2.equals(exampleResponse3));
    }

    @isTest
    private static void consistentHashCodeValue() {
        OASExampleResponse exampleResponse1 = OASExampleResponse.getExample();
        OASExampleResponse exampleResponse2 = new OASExampleResponse();

        System.assertEquals(exampleResponse1.hashCode(), exampleResponse1.hashCode());
        System.assertEquals(exampleResponse2.hashCode(), exampleResponse2.hashCode());
    }

    @isTest
    private static void equalInstancesHaveSameHashCode() {
        OASExampleResponse exampleResponse1 = OASExampleResponse.getExample();
        OASExampleResponse exampleResponse2 = OASExampleResponse.getExample();
        OASExampleResponse exampleResponse3 = new OASExampleResponse();
        OASExampleResponse exampleResponse4 = new OASExampleResponse();

        System.assert(exampleResponse1.equals(exampleResponse2));
        System.assert(exampleResponse3.equals(exampleResponse4));
        System.assertEquals(exampleResponse1.hashCode(), exampleResponse2.hashCode());
        System.assertEquals(exampleResponse3.hashCode(), exampleResponse4.hashCode());
    }

    @isTest
    private static void defaultValuesPopulated() {
        OASExampleResponse exampleResponse = new OASExampleResponse();
        System.assertEquals(new List<Boolean>(), exampleResponse.myOnlyProperty);
    }
}
