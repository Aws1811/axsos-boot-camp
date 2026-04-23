$(document).ready(function () {

//  when hover the box will increas in width
    $(".card").hover(function () {
        $(this).animate({
            width: "330px"
        }, 200);
    }, function () {
        $(this).animate({
            width: "300px"
        }, 200);
    });

    // onclicking the button it will give a detailes
    $("#moreBtn").click(function () {
        $(".details").slideToggle();

        if ($(this).text() === "Show Details") {
            $(this).text("Hide Details");
        } else {
            $(this).text("Show Details");
        }
    });

    // this button for changing the theme and get it back
    $("#themeBtn").click(function () {
        $("body").toggleClass("dark");

        if ($("body").hasClass("dark")) {
            $("body").css("background", "#111");
            $(".card").css("background", "#222").css("color", "white");
        } else {
            $("body").css("background", "linear-gradient(135deg, #0d1d39, #21a951)");
            $(".card").css("background", "white").css("color", "black");
        }
    });

});