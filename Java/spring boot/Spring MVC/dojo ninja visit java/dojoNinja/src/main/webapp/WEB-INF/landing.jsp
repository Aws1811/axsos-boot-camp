<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Ninja Dojo</title>
    <link rel="preconnect" href="https://fonts.googleapis.com">
    <link href="https://fonts.googleapis.com/css2?family=Bebas+Neue&family=Inter:wght@400;500;600;700&display=swap" rel="stylesheet">
    <script src="https://cdn.tailwindcss.com"></script>
    <script>
        tailwind.config = {
            theme: {
                extend: {
                    colors: {
                        ink:   '#001524',
                        teal:  '#15616D',
                        cream: '#FFECD1',
                        orange:'#FF7D00',
                        rust:  '#78290F'
                    },
                    fontFamily: {
                        display: ['Bebas Neue', 'sans-serif'],
                        body: ['Inter', 'sans-serif']
                    }
                }
            }
        }
    </script>
    <style>
        /* belt-knot corner fold — the recurring signature motif */
        .belt-fold { clip-path: polygon(0 0, 100% 0, 100% 100%, 32px 100%, 0 calc(100% - 32px)); }
        .belt-stripe { background: linear-gradient(90deg, #15616D 0 20%, #FFECD1 20% 40%, #FF7D00 40% 70%, #78290F 70% 100%); }
    </style>
</head>
<body class="bg-ink font-body text-cream min-h-screen flex flex-col">

<div class="belt-stripe h-1.5 w-full"></div>

<main class="flex-1 flex items-center justify-center px-6">
    <div class="max-w-xl w-full text-center">

        <p class="font-display tracking-[0.3em] text-orange text-sm mb-4">ESTABLISHED ROSTER SYSTEM</p>
        <h1 class="font-display text-6xl md:text-7xl leading-none mb-6">
            NINJA<span class="text-orange">DOJO</span>
        </h1>
        <p class="text-cream/60 text-sm md:text-base mb-12 max-w-sm mx-auto">
            Stand up a dojo, enroll your ninjas, and keep every roster sharp.
        </p>

        <div class="flex flex-col sm:flex-row gap-4 justify-center">
            <a href="dojos/new"
               class="belt-fold bg-orange text-ink font-display text-lg tracking-wide px-8 py-4 hover:bg-orange/90 transition">
                Build a dojo
            </a>
            <a href="ninja"
               class="belt-fold bg-teal text-cream font-display text-lg tracking-wide px-8 py-4 hover:bg-teal/90 transition">
                Enroll a ninja
            </a>
        </div>

    </div>
</main>

<footer class="belt-stripe h-1.5 w-full"></footer>

</body>
</html>
