# Session Counter

## Preview

![result](result.png)

## Run the app

```
python server.py
```

Then open your browser at: `http://127.0.0.1:5001`

## Built With

- [Flask](https://flask.palletsprojects.com/) — Python web framework
- [Jinja2](https://jinja.palletsprojects.com/) — HTML templating engine

## Features

- **User Counter** — tracks manual interactions only (resets on destroy)
- **Actual Counter** — tracks every page visit including refreshes, never resets
- **+2 button** — adds 2 to the user counter
- **Slider** — pick a number between 4 and 30, then hit Submit to set it
- **+N button** — adds the selected slider value to the user counter
- **Reset button** — resets the user counter only, actual counter keeps going