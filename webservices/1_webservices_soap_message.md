# <center>__SOAP - Message Structure__</center>

*   __Envelope__ : Defines the start and end of the message.
*   __Header__   : Contains any optional attributes of the message.
*   __Body__     : Contains the XML data comprising the message being start.
*   __Fault__    : An optional Fault element that provides information about error.

```xml
<soap:Envelope
    xmlns:soap="http://www.w3.org/2003/05/soap-envelope/"
    soap:encodingStyle="http://www.w3.org/2003/05/soap-encoding">

    <soap:Header>
        ...
        ...
    </soap:Header>

    <soap:Body>
        ...
        ...
        <soap:Fault>
            ...
            ...
        </soap:Fault>
        ...
        ...
    </soap:Body>

</soap:Envelope>
```
