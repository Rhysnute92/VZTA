// import GeoJSON from '/nodeMods/node_modules/ol/format/GeoJSON.js';
// import Map from '/nodeMods/node_modules/ol/Map.js';
// import VectorLayer from '/nodeMods/node_modules/ol/source/Vector.js'
// import VectorSource from '/nodeMods/node_modules/ol/source/Vector.js';
// import View from '/nodeMods/node_modules/ol/View.js';
// import {DragBox, Select} from '/nodeMods/node_modules/ol/interaction.js';
// import {Fill, Stroke, Style} from '/nodeMods/node_modules/ol/style.js';
// import {getWidth} from '/nodeMods/node_modules/ol/extent.js';
// import {platformModifierKeyOnly} from '/nodeMods/node_modules/ol/events/condition.js';
// // //Invesitgate created directories mnode module mapstest and extent.js
// // import GeoJSON from '/node_modules/ol/format/GeoJSON.js';
// // import Map from '/ol/Map.js';
// // import VectorLayer from '/ol/layer/Vector.js';
// // import VectorSource from '/ol/source/Vector.js';
// // import View from '/ol/View.js';
// // import {DragBox, Select} from '/ol/interaction.js';
// // import {Fill, Stroke, Style} from '/ol/style.js';
// // import {getWidth} from '/ol/extent.js';
// // import {platformModifierKeyOnly} from '/ol/events/condition.js';
// //
//
// const vectorSource = new VectorSource({
//     url: 'https://openlayers.org/data/vector/ecoregions.json',
//     format: new GeoJSON(),
// });
//
// const style = new Style({
//     fill: new Fill({
//         color: '#eeeeee',
//     }),
// });
//
// const map = new Map({
//     layers: [
//         new VectorLayer({
//             source: vectorSource,
//             background: '#1a2b39',
//             style: function (feature) {
//                 const color = feature.get('COLOR_BIO') || '#eeeeee';
//                 style.getFill().setColor(color);
//                 return style;
//             },
//         }),
//     ],
//     target: 'map',
//     view: new View({
//         center: [0, 0],
//         zoom: 2,
//         constrainRotation: 16,
//     }),
// });
//
// const selectedStyle = new Style({
//     fill: new Fill({
//         color: 'rgba(255, 255, 255, 0.6)',
//     }),
//     stroke: new Stroke({
//         color: 'rgba(255, 255, 255, 0.7)',
//         width: 2,
//     }),
// });
//
// // a normal select interaction to handle click
// const select = new Select({
//     style: function (feature) {
//         const color = feature.get('COLOR_BIO') || '#eeeeee';
//         selectedStyle.getFill().setColor(color);
//         return selectedStyle;
//     },
// });
// map.addInteraction(select);
//
// const selectedFeatures = select.getFeatures();
//
// // a DragBox interaction used to select features by drawing boxes
// const dragBox = new DragBox({
//     condition: platformModifierKeyOnly,
// });
//
// map.addInteraction(dragBox);
//
// dragBox.on('boxend', function () {
//     const boxExtent = dragBox.getGeometry().getExtent();
//
//     // if the extent crosses the antimeridian process each world separately
//     const worldExtent = map.getView().getProjection().getExtent();
//     const worldWidth = getWidth(worldExtent);
//     const startWorld = Math.floor((boxExtent[0] - worldExtent[0]) / worldWidth);
//     const endWorld = Math.floor((boxExtent[2] - worldExtent[0]) / worldWidth);
//
//     for (let world = startWorld; world <= endWorld; ++world) {
//         const left = Math.max(boxExtent[0] - world * worldWidth, worldExtent[0]);
//         const right = Math.min(boxExtent[2] - world * worldWidth, worldExtent[2]);
//         const extent = [left, boxExtent[1], right, boxExtent[3]];
//
//         const boxFeatures = vectorSource
//             .getFeaturesInExtent(extent)
//             .filter(
//                 (feature) =>
//                     !selectedFeatures.getArray().includes(feature) &&
//                     feature.getGeometry().intersectsExtent(extent)
//             );
//
//         // features that intersect the box geometry are added to the
//         // collection of selected features
//
//         // if the view is not obliquely rotated the box geometry and
//         // its extent are equalivalent so intersecting features can
//         // be added directly to the collection
//         const rotation = map.getView().getRotation();
//         const oblique = rotation % (Math.PI / 2) !== 0;
//
//         // when the view is obliquely rotated the box extent will
//         // exceed its geometry so both the box and the candidate
//         // feature geometries are rotated around a common anchor
//         // to confirm that, with the box geometry aligned with its
//         // extent, the geometries intersect
//         if (oblique) {
//             const anchor = [0, 0];
//             const geometry = dragBox.getGeometry().clone();
//             geometry.translate(-world * worldWidth, 0);
//             geometry.rotate(-rotation, anchor);
//             const extent = geometry.getExtent();
//             boxFeatures.forEach(function (feature) {
//                 const geometry = feature.getGeometry().clone();
//                 geometry.rotate(-rotation, anchor);
//                 if (geometry.intersectsExtent(extent)) {
//                     selectedFeatures.push(feature);
//                 }
//             });
//         } else {
//             selectedFeatures.extend(boxFeatures);
//         }
//     }
// });
//
// // clear selection when drawing a new box and when clicking on the map
// dragBox.on('boxstart', function () {
//     selectedFeatures.clear();
// });
//
// const infoBox = document.getElementById('info');
//
// selectedFeatures.on(['add', 'remove'], function () {
//     const names = selectedFeatures.getArray().map((feature) => {
//         return feature.get('ECO_NAME');
//     });
//     if (names.length > 0) {
//         infoBox.innerHTML = names.join(', ');
//     } else {
//         infoBox.innerHTML = 'None';
//     }
// });