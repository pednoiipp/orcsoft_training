# __Schema-to-Java Mapping__

| XML Schema Type   | Java Data Type                            |
| -------------     | ----------------------------------------- |
| xsd:string        |   java.lang.String                        |
| xsd:integer       |   java.math.BigInteger                    |
| xsd:int           |   int                                     |
| xsd.long          |   long                                    |
| xsd:short         |   short                                   |
| xsd:decimal       |   java.math.BigDecimal                    |
| xsd:float         |   float                                   |
| xsd:double        |   double                                  |
| xsd:boolean       |   boolean                                 |
| xsd:byte          |   byte                                    |
| xsd:QName         |   javax.xml.namespace.QName               |
| xsd:dateTime      |   javax.xml.datatype.XMLGregorianCalendar |
| xsd:base64Binary  |   byte[]                                  |
| xsd:hexBinary     |   byte[]                                  |
| xsd:unsignedInt   |   long                                    |
| xsd:unsignedShort |   int                                     |
| xsd:unsignedByte  |   short                                   |
| xsd:time          |   javax.xml.datatype.XMLGregorianCalendar |
| xsd:date          |   javax.xml.datatype.XMLGregorianCalendar |
| xsd:g             |   javax.xml.datatype.XMLGregorianCalendar |
| xsd:anySimpleType |   java.lang.Object                        |
| xsd:anySimpleType |   java.lang.String                        |
| xsd:duration      |   javax.xml.datatype.Duration             |
| xsd:NOTATION      |   javax.xml.namespace.QName               |
