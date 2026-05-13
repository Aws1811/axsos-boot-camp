#  Aws Grid

A dynamic grid generator built with **Flask** and **Jinja2**. Every 5th tile is highlighted in red.

---

##  Usage

```
/play/<x>/<color>
```

| Parameter | Description | Example |
|---|---|---|
| `x` | Number of tiles | `20` |
| `color` | Tile color | `blue` |

**Examples:**
```
/play/          → 4 blue tiles (default)
/play/20        → 20 blue tiles
/play/20/green  → 20 green tiles
```

> Every **5th tile** is always highlighted in red.

---

