if(resolutionSpinner.getSelectedItem().toString().equals(activity.getString(R.string.custom)))
        {
            assertEquals(resolutionCustomContainer.getVisibility(), View.VISIBLE);
        }
        else
        {
            assertEquals(resolutionSpinner.getSelectedItem().toString(), expected.videoResolution);
            assertEquals(resolutionCustomContainer.getVisibility(), View.GONE);
        }
