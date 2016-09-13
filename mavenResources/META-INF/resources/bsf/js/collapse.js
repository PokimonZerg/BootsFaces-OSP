/*
 jshint latedef: false  ========================================================================
 Bootstrap: collapse.js v3.3.7
 http://getbootstrap.com/javascript/#collapse
 ========================================================================
 Copyright 2011-2016 Twitter, Inc.
 Licensed under MIT (https://github.com/twbs/bootstrap/blob/master/LICENSE)
 ======================================================================== */
+function(c){function h(a){var b;a=a.attr("data-target")||(b=a.attr("href"))&&b.replace(/.*(?=#[^\s]+$)/,"");return c(a)}function g(a){return this.each(function(){var b=c(this),f=b.data("bs.collapse"),e=c.extend({},d.DEFAULTS,b.data(),"object"==typeof a&&a);!f&&e.toggle&&/show|hide/.test(a)&&(e.toggle=!1);f||b.data("bs.collapse",f=new d(this,e));if("string"==typeof a)f[a]()})}var d=function(a,b){this.$element=c(a);this.options=c.extend({},d.DEFAULTS,b);this.$trigger=c('[data-toggle="collapse"][href="#'+
a.id+'"],[data-toggle="collapse"][data-target="#'+a.id+'"]');this.transitioning=null;this.options.parent?this.$parent=this.getParent():this.addAriaAndCollapsedClass(this.$element,this.$trigger);this.options.toggle&&this.toggle()};d.VERSION="3.3.7";d.TRANSITION_DURATION=350;d.DEFAULTS={toggle:!0};d.prototype.dimension=function(){return this.$element.hasClass("width")?"width":"height"};d.prototype.show=function(){if(!this.transitioning&&!this.$element.hasClass("in")){var a,b=this.$parent&&this.$parent.children(".panel").children(".in, .collapsing");
if(b&&b.length&&(a=b.data("bs.collapse"))&&a.transitioning)return;var f=c.Event("show.bs.collapse");this.$element.trigger(f);if(!f.isDefaultPrevented()){b&&b.length&&(g.call(b,"hide"),a||b.data("bs.collapse",null));var e=this.dimension();this.$element.removeClass("collapse").addClass("collapsing")[e](0).attr("aria-expanded",!0);this.$trigger.removeClass("collapsed").attr("aria-expanded",!0);this.transitioning=1;a=function(){this.$element.removeClass("collapsing").addClass("collapse in")[e]("");this.transitioning=
0;this.$element.trigger("shown.bs.collapse")};if(!c.support.transition)return a.call(this);b=c.camelCase(["scroll",e].join("-"));this.$element.one("bsTransitionEnd",c.proxy(a,this)).emulateTransitionEnd(d.TRANSITION_DURATION)[e](this.$element[0][b])}}};d.prototype.hide=function(){if(!this.transitioning&&this.$element.hasClass("in")){var a=c.Event("hide.bs.collapse");this.$element.trigger(a);if(!a.isDefaultPrevented()){a=this.dimension();this.$element[a](this.$element[a]())[0].offsetHeight;this.$element.addClass("collapsing").removeClass("collapse in").attr("aria-expanded",
!1);this.$trigger.addClass("collapsed").attr("aria-expanded",!1);this.transitioning=1;var b=function(){this.transitioning=0;this.$element.removeClass("collapsing").addClass("collapse").trigger("hidden.bs.collapse")};if(!c.support.transition)return b.call(this);this.$element[a](0).one("bsTransitionEnd",c.proxy(b,this)).emulateTransitionEnd(d.TRANSITION_DURATION)}}};d.prototype.toggle=function(){this[this.$element.hasClass("in")?"hide":"show"]()};d.prototype.getParent=function(){return c(this.options.parent).find('[data-toggle="collapse"][data-parent="'+
this.options.parent+'"]').each(c.proxy(function(a,b){var d=c(b);this.addAriaAndCollapsedClass(h(d),d)},this)).end()};d.prototype.addAriaAndCollapsedClass=function(a,b){var c=a.hasClass("in");a.attr("aria-expanded",c);b.toggleClass("collapsed",!c).attr("aria-expanded",c)};var k=c.fn.collapse;c.fn.collapse=g;c.fn.collapse.Constructor=d;c.fn.collapse.noConflict=function(){c.fn.collapse=k;return this};c(document).on("click.bs.collapse.data-api",'[data-toggle="collapse"]',function(a){var b=c(this);b.attr("data-target")||
a.preventDefault();a=h(b);b=a.data("bs.collapse")?"toggle":b.data();g.call(a,b)})}(jQuery);