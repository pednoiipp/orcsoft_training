# __JSON - How to__

## <center>__JSON - String to Object__</center>

```javascript

var text = '{"school": {"students": [' +
        '{"id": 1,"name": "Parwin","surname": "Rungpiriyadej","nickname": "Win","phone": "080-123-4567"},' +
        '{"id": 2,"name": "Supassra","surname": "Thanachat","nickname": "Kao","phone": "080-xxx-xxxx"}' +
        ']}}';

var obj = JSON.parse(text); // convert json string to object

console.log(obj); // print console check result what happen with it ?

```

## <center>__JSON - Object to String__</center>

```javascript

var obj = {
    "school": {
        "students": [{
            "id": 1,
            "name": "Parwin",
            "surname": "Rungpiriyadej",
            "nickname": "Win",
            "phone": "080-123-4567"
        }, {
            "id": 2,
            "name": "Supassra",
            "surname": "Thanachat",
            "nickname": "Kao",
            "phone": "080-xxx-xxxx"}
        ]
    }
};

var text = JSON.stringify(obj); // convert object to json string

console.log(text); // print console check result what happen with it ?

```
