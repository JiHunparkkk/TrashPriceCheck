parcelRequire = function(e, r, t, n) {
    var i, o = "function" == typeof parcelRequire && parcelRequire, u = "function" == typeof require && require;
    function f(t, n) {
        if (!r[t]) {
            if (!e[t]) {
                var i = "function" == typeof parcelRequire && parcelRequire;
                if (!n && i) return i(t, !0);
                if (o) return o(t, !0);
                if (u && "string" == typeof t) return u(t);
                var c = new Error("Cannot find module '" + t + "'");
                throw c.code = "MODULE_NOT_FOUND", c
            }
            p.resolve = function(r) {
                return e[t][1][r] || r
            }, p.cache = {};
            var l = r[t] = new f.Module(t);
            e[t][0].call(l.exports, p, l, l.exports, this)
        }
        return r[t].exports
    }
    f.isParcelRequire = !0, f.Module = function(e) {
        this.id = e, this.bundle = f, this.exports = {}
    }, f.modules = e, f.cache = r, f.parent = o, f.register = function(r, t) {
        e[r] = [function(e, r) {
            r.exports = t
        }, {}]
    };
    for (var c = 0; c < t.length; c++) try {
        f(t[c])
    } catch (e) {
        i || (i = e)
    }
    if (t.length) {
        var l = f(t[t.length - 1]);
        "object" == typeof exports && "undefined" != typeof module ? module.exports = l : "function" == typeof define && define.amd ? define(function() {
            return l
        }) : n && (this[n] = l)
    }
    if (parcelRequire = f, i) throw i;
    return f
}({
    qEKZ: [function(require, module, exports) {
        var x = document.getElementById("cnvs"),
            y = .96 * x.clientWidth,
            t = .96 * x.clientHeight;
        x.style.position = "relative", x.style.display = "inline-block";
        var e = document.getElementById("myCanvas"),
            o = e.getContext("2d");
        e.width = y, e.height = t, e.style.position = "absolute", e.style.left = "0px";
        var r = document.getElementById("hoberCanvas"),
            a = r.getContext("2d");
        r.width = y, r.height = t, r.style.position = "absolute", r.style.left = "0px";
        var l = [{
            x: .59,
            y: .04
        }, {
            x: .59,
            y: .07
        }, {
            x: .62,
            y: .07
        }, {
            x: .47,
            y: .1
        }, {
            x: .5,
            y: .1
        }, {
            x: .53,
            y: .1
        }, {
            x: .56,
            y: .1
        }, {
            x: .59,
            y: .1
        }, {
            x: .62,
            y: .1
        }, {
            x: .38,
            y: .13
        }, {
            x: .41,
            y: .13
        },.
