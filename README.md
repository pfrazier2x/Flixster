# Android Project 3 - Flixster+

Submitted by: **Preston Frazier**

**Flixster+** is a movie browsing app that allows users to browse movies currently playing in theaters. The app uses The Movie Database API to display movie posters, titles, and descriptions in a scrollable list.

Time spent: **8 hours** spent in total

## Required Features

The following **required** functionality is completed:

- [x] **Make a request to [The Movie Database API's `now_playing`](https://developer.themoviedb.org/reference/movie-now-playing-list) endpoint to get a list of current movies**
- [x] **Parse through JSON data and implement a RecyclerView to display all movies**
- [x] **Use Glide to load and display movie poster images**

The following **optional** features are implemented:

- [ ] Improve and customize the user interface through styling and coloring
- [ ] Implement orientation responsivity
  - App should neatly arrange data in both landscape and portrait mode
- [ ] Implement Glide to display placeholder graphics during loading

The following **additional** features are implemented:

- [ ] None at this time

## Video Walkthrough

Here's a walkthrough of implemented user stories:

<img src='YOUR_GIF_LINK_HERE' title='Video Walkthrough' width='' alt='Video Walkthrough' />

GIF created with **Kap**

## Notes

One challenge I encountered while building Flixster+ was connecting the app to The Movie Database API and parsing the returned JSON data. I also had to make sure the correct base image URL was added to each poster path so Glide could properly load the movie posters. After connecting the API data to the RecyclerView, I was able to display and scroll through the current movies successfully.

## License

    Copyright 2026 Preston Frazier

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
