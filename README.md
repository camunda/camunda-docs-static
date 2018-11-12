# camunda-docs-static

Contains all un-versioned sections of the documentation

**Important:** _do NOT change the content of `themes/camunda` directory directly!_ Instead, Change the [theme](//github.com/camunda/camunda-docs-theme).

## Installing Hugo

In order to build this documentation, you first need to install [hugo][hugo] v0.50 (newer versions _may_ work).

See the [hugo installation guide][hugo-installation] for more details on howto install Hugo.

## Building the Documentation

After you have installed hugo, you can build the docs by typing the following command:

```bash
hugo
```

A static build of the documentation will be placed in the `public/` folder.

While editing the docs, you probably want to start the hugo server (defaults to "watch mode"):

```bash
hugo server --baseUrl="http://localhost"
```

You can then browse the docs under [http://localhost:1313/](http://localhost:1313/).
Hugo will automatically detect when you change a file and refresh the page in the browser.

## Adding a Banner

Edit the file `config/banners.html`:

add or remove a div with the attribute `data-banner`.

This is an example of a blockquote-style, html based banner. It will be visualized with a bar on the left.

```html
<div data-banner>
  <blockquote>
    <p>
      We are looking for talented people.
    </p>
    <p>
      Check out our <a href="http://camunda.com/about/jobs/">open positions</a>.
    </p>
  </blockquote>
</div>
```

[hugo]: http://gohugo.io/
[hugo-installation]: http://gohugo.io/overview/installing/
