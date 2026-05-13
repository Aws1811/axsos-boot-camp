# ♟️ Checkerboard Generator

A  checkerboard  built with **Flask** and **Jinja2** .
---

## 🚀 Usage

```
/<x>/<y>/<color1>/<color2>
```

| Parameter | Description | Example |
|---|---|---|
| `x` | Number of columns *(divisible by 4)* | `8` |
| `y` | Number of rows *(divisible by 4)* | `8` |
| `color1` | First color | `red` |
| `color2` | Second color | `black` |

**Examples:**
```
/               → 8x8 red & black (default)
/8/8            → 8x8 red & black
/8/8/blue/white → 8x8 blue & white
```

> ⚠️ Both `x` and `y` must be divisible by 4, otherwise an error message is shown.

---
