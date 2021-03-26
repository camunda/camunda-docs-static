# camunda-docs-static

Contains all un-versioned sections of the documentation

**Important:** _Do NOT change the content of `themes/camunda` directory directly!_ Instead, Change the [theme](//github.com/camunda/camunda-docs-theme).

## Installing Hugo

In order to build this documentation, you first need to install [hugo v0.50][hugo-v50] (newer versions _may_ work).

See the [hugo installation guide][hugo-installation] for more details on how to install Hugo.

## Building the Documentation

After you have installed hugo, navigate to the content directory you would like to modify. For the static documentation found in this repo, this includes the following sections:

* Enterprise 
* Get Started
* Security

**Please note** The directory must have a config.yaml file for hugo to build.

Then, you can build the docs by typing the following command:

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

Add or remove a div with the attribute `data-banner`.

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
[hugo-v50]: https://github.com/gohugoio/hugo/releases/tag/v0.50
[hugo-installation]: http://gohugo.io/overview/installing/
