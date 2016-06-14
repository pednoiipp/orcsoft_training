# <center>__jQuery - Get / Set / Attributes__</center>

## ```[ get / set ]``` text and html

```html
<!DOCTYPE html>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
    <script>
        $(document).ready(function() {
            $("#btn1").click(function() {
                alert("Text: " + $("#test").text());
            });
            $("#btn2").click(function() {
                alert("HTML: " + $("#test").html());
            });
        });
    </script>
</head>
<body>
    <p id="test">This is some <b>bold</b> text in a paragraph.</p>
    <button id="btn1">Show Text</button>
    <button id="btn2">Show HTML</button>
</body>
</html>
```

## ```[ get / set ]``` attr

```html
<!DOCTYPE html>
<html>
<head>
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
    <script>
        $(document).ready(function() {
            $("button").click(function() {
                alert($("#w3s").attr("href"));
            });
        });
    </script>
</head>
<body
    <p><a href="http://www.w3schools.com" id="w3s">W3Schools.com</a></p>
    <button>Show href Value</button>
</body>
</html>
```
